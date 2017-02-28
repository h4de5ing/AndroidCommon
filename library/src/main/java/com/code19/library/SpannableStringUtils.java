package com.code19.library;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.QuoteSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;

import static android.graphics.BlurMaskFilter.Blur;

/**
 * <pre>
 *     author: Blankj
 *     blog  : http://blankj.com
 *     time  : 16/12/13
 *     https://github.com/smuyyh/CommonLibary
 *     https://github.com/Blankj/AndroidUtilCode
 *     https://github.com/Blankj/AndroidUtilCode/blob/master/utilcode/src/main/java/com/blankj/utilcode/utils/SpannableStringUtils.java
 *     doc http://www.jianshu.com/p/ab1a72750824
 * </pre>
 */
public class SpannableStringUtils {

    private SpannableStringUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Builder getBuilder(Context context, @NonNull CharSequence text) {
        return new Builder(context, text);
    }

    public static class Builder {

        private int defaultValue = 0x12000000;
        private CharSequence text;

        private int flag;
        @ColorInt
        private int foregroundColor;
        @ColorInt
        private int backgroundColor;
        @ColorInt
        private int quoteColor;

        private boolean isLeadingMargin;
        private int first;
        private int rest;

        private boolean isBullet;
        private int gapWidth;
        private int bulletColor;

        private float proportion;
        private float xProportion;
        private boolean isStrikethrough;
        private boolean isUnderline;
        private boolean isSuperscript;
        private boolean isSubscript;
        private boolean isBold;
        private boolean isItalic;
        private boolean isBoldItalic;
        private String fontFamily;
        private Alignment align;

        private boolean imageIsBitmap;
        private Bitmap bitmap;
        private boolean imageIsDrawable;
        private Drawable drawable;
        private boolean imageIsUri;
        private Uri uri;
        private boolean imageIsResourceId;
        @DrawableRes
        private int resourceId;

        private ClickableSpan clickSpan;
        private String url;

        private boolean isBlur;
        private float radius;
        private Blur style;
        private Context mContext;

        private SpannableStringBuilder mBuilder;


        private Builder(Context context, @NonNull CharSequence text) {
            this.mContext = context;
            this.text = text;
            flag = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE;
            foregroundColor = defaultValue;
            backgroundColor = defaultValue;
            quoteColor = defaultValue;
            proportion = -1;
            xProportion = -1;
            mBuilder = new SpannableStringBuilder();
        }

        public Builder setFlag(int flag) {
            this.flag = flag;
            return this;
        }

        public Builder setForegroundColor(@ColorInt int color) {
            this.foregroundColor = color;
            return this;
        }

        public Builder setBackgroundColor(@ColorInt int color) {
            this.backgroundColor = color;
            return this;
        }

        public Builder setQuoteColor(@ColorInt int color) {
            this.quoteColor = color;
            return this;
        }

        public Builder setLeadingMargin(int first, int rest) {
            this.first = first;
            this.rest = rest;
            isLeadingMargin = true;
            return this;
        }

        public Builder setBullet(int gapWidth, int color) {
            this.gapWidth = gapWidth;
            bulletColor = color;
            isBullet = true;
            return this;
        }

        public Builder setProportion(float proportion) {
            this.proportion = proportion;
            return this;
        }

        public Builder setXProportion(float proportion) {
            this.xProportion = proportion;
            return this;
        }

        public Builder setStrikethrough() {
            this.isStrikethrough = true;
            return this;
        }


        public Builder setUnderline() {
            this.isUnderline = true;
            return this;
        }


        public Builder setSuperscript() {
            this.isSuperscript = true;
            return this;
        }


        public Builder setSubscript() {
            this.isSubscript = true;
            return this;
        }


        public Builder setBold() {
            isBold = true;
            return this;
        }


        public Builder setItalic() {
            isItalic = true;
            return this;
        }


        public Builder setBoldItalic() {
            isBoldItalic = true;
            return this;
        }


        public Builder setFontFamily(@Nullable String fontFamily) {
            this.fontFamily = fontFamily;
            return this;
        }


        public Builder setAlign(@Nullable Alignment align) {
            this.align = align;
            return this;
        }


        public Builder setBitmap(@NonNull Bitmap bitmap) {
            this.bitmap = bitmap;
            imageIsBitmap = true;
            return this;
        }


        public Builder setDrawable(@NonNull Drawable drawable) {
            this.drawable = drawable;
            imageIsDrawable = true;
            return this;
        }


        public Builder setUri(@NonNull Uri uri) {
            this.uri = uri;
            imageIsUri = true;
            return this;
        }


        public Builder setResourceId(@DrawableRes int resourceId) {
            this.resourceId = resourceId;
            imageIsResourceId = true;
            return this;
        }


        public Builder setClickSpan(@NonNull ClickableSpan clickSpan) {
            this.clickSpan = clickSpan;
            return this;
        }


        public Builder setUrl(@NonNull String url) {
            this.url = url;
            return this;
        }


        public Builder setBlur(float radius, Blur style) {
            this.radius = radius;
            this.style = style;
            this.isBlur = true;
            return this;
        }


        public Builder append(@NonNull CharSequence text) {
            setSpan();
            this.text = text;
            return this;
        }

        public SpannableStringBuilder create() {
            setSpan();
            return mBuilder;
        }

        private void setSpan() {
            int start = mBuilder.length();
            mBuilder.append(this.text);
            int end = mBuilder.length();
            if (foregroundColor != defaultValue) {
                mBuilder.setSpan(new ForegroundColorSpan(foregroundColor), start, end, flag);
                foregroundColor = defaultValue;
            }
            if (backgroundColor != defaultValue) {
                mBuilder.setSpan(new BackgroundColorSpan(backgroundColor), start, end, flag);
                backgroundColor = defaultValue;
            }
            if (isLeadingMargin) {
                mBuilder.setSpan(new LeadingMarginSpan.Standard(first, rest), start, end, flag);
                isLeadingMargin = false;
            }
            if (quoteColor != defaultValue) {
                mBuilder.setSpan(new QuoteSpan(quoteColor), start, end, 0);
                quoteColor = defaultValue;
            }
            if (isBullet) {
                mBuilder.setSpan(new BulletSpan(gapWidth, bulletColor), start, end, 0);
                isBullet = false;
            }
            if (proportion != -1) {
                mBuilder.setSpan(new RelativeSizeSpan(proportion), start, end, flag);
                proportion = -1;
            }
            if (xProportion != -1) {
                mBuilder.setSpan(new ScaleXSpan(xProportion), start, end, flag);
                xProportion = -1;
            }
            if (isStrikethrough) {
                mBuilder.setSpan(new StrikethroughSpan(), start, end, flag);
                isStrikethrough = false;
            }
            if (isUnderline) {
                mBuilder.setSpan(new UnderlineSpan(), start, end, flag);
                isUnderline = false;
            }
            if (isSuperscript) {
                mBuilder.setSpan(new SuperscriptSpan(), start, end, flag);
                isSuperscript = false;
            }
            if (isSubscript) {
                mBuilder.setSpan(new SubscriptSpan(), start, end, flag);
                isSubscript = false;
            }
            if (isBold) {
                mBuilder.setSpan(new StyleSpan(Typeface.BOLD), start, end, flag);
                isBold = false;
            }
            if (isItalic) {
                mBuilder.setSpan(new StyleSpan(Typeface.ITALIC), start, end, flag);
                isItalic = false;
            }
            if (isBoldItalic) {
                mBuilder.setSpan(new StyleSpan(Typeface.BOLD_ITALIC), start, end, flag);
                isBoldItalic = false;
            }
            if (fontFamily != null) {
                mBuilder.setSpan(new TypefaceSpan(fontFamily), start, end, flag);
                fontFamily = null;
            }
            if (align != null) {
                mBuilder.setSpan(new AlignmentSpan.Standard(align), start, end, flag);
                align = null;
            }
            if (imageIsBitmap || imageIsDrawable || imageIsUri || imageIsResourceId) {
                if (imageIsBitmap) {
                    mBuilder.setSpan(new ImageSpan(mContext, bitmap), start, end, flag);
                    bitmap = null;
                    imageIsBitmap = false;
                } else if (imageIsDrawable) {
                    mBuilder.setSpan(new ImageSpan(drawable), start, end, flag);
                    drawable = null;
                    imageIsDrawable = false;
                } else if (imageIsUri) {
                    mBuilder.setSpan(new ImageSpan(mContext, uri), start, end, flag);
                    uri = null;
                    imageIsUri = false;
                } else {
                    mBuilder.setSpan(new ImageSpan(mContext, resourceId), start, end, flag);
                    resourceId = 0;
                    imageIsResourceId = false;
                }
            }
            if (clickSpan != null) {
                mBuilder.setSpan(clickSpan, start, end, flag);
                clickSpan = null;
            }
            if (url != null) {
                mBuilder.setSpan(new URLSpan(url), start, end, flag);
                url = null;
            }
            if (isBlur) {
                mBuilder.setSpan(new MaskFilterSpan(new BlurMaskFilter(radius, style)), start, end, flag);
                isBlur = false;
            }
            flag = Spanned.SPAN_EXCLUSIVE_EXCLUSIVE;
        }
    }
}