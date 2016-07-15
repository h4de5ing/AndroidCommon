/*
 *   Copyright (C)  2016 android@19code.com
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.code19.androidcommon.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.code19.androidcommon.R;
import com.code19.androidcommon.model.AppBean;
import com.code19.library.AppUtils;
import com.code19.library.L;

import java.util.List;

/**
 * Create by h4de5ing 2016/5/24 024
 */
public class AppRecyAdapter extends RecyclerView.Adapter<AppRecyAdapter.AppViewHolder> {
    private Context mContext;
    private List<AppBean> mDatas;
    private LayoutInflater mLayoutInflater;

    public AppRecyAdapter(Context context, List<AppBean> list) {
        this.mContext = context;
        this.mDatas = list;
        this.mLayoutInflater = LayoutInflater.from(context);
    }


    @Override
    public AppViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AppViewHolder(mLayoutInflater.inflate(R.layout.app_recy, parent, false));
    }

    @Override
    public int getItemCount() {
        return mDatas.size() != 0 ? mDatas.size() : 0;
    }

    @Override
    public void onBindViewHolder(AppViewHolder holder, int position) {
        holder.tv_name.setText(mDatas.get(position).getAppName());
        holder.iv_icon.setImageDrawable(mDatas.get(position).getAppIcon());
    }

    class AppViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        ImageView iv_icon;

        public AppViewHolder(View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.recy_name);
            iv_icon = (ImageView) itemView.findViewById(R.id.recy_icon);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    L.i(mDatas.get(getAdapterPosition()).getAppPackage(), getAdapterPosition());
                    //Toast.makeText(mContext, "点击了Item" + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                    AppUtils.runApp(mContext, mDatas.get(getAdapterPosition()).getAppPackage());
                }
            });
        }
    }
}
