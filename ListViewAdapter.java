package co.gymglishproject.mobile.gymglishproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class ListViewAdapter extends ArrayAdapter<WebSite> {

    Context mContext;
    int mLayoutResourceId;
    ArrayList<WebSite> mData= null;


    public ListViewAdapter(Context context, int resource,  ArrayList<WebSite> data) {
        super(context, resource, data);

        this.mContext = context;
        this.mLayoutResourceId = resource;
        this.mData = data;
    }


    @Override
    public WebSite getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {


        View row = convertView;
        WebViewHolder holder;

        if (row == null) {

            // create a new view

            LayoutInflater inflater = LayoutInflater.from(mContext);
            row = inflater.inflate(mLayoutResourceId, parent, false);

            holder = new WebViewHolder();
            holder.siteUrl = (TextView) row.findViewById(R.id.web);
            holder.imageView =(ImageView)row.findViewById(R.id.imageView2);


            row.setTag(holder);


        } else {


            /// Other wise use a existing one

            holder = (WebViewHolder) row.getTag();

        }


        WebSite webSite = mData.get(position);


        holder.siteUrl.setText(webSite.getSiteUrl());
        Picasso.with(mContext).load(webSite.getImgUrl()).into(holder.imageView);





        return row;


    }

    private static class WebViewHolder {


        TextView siteUrl;
        ImageView imageView;


    }

}
