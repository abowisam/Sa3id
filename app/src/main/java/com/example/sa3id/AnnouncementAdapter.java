package com.example.sa3id;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.sa3id.UserActivities.AnnouncementViewActivity;

import java.util.List;

public class AnnouncementAdapter extends ArrayAdapter<Announcement> {
    Context context;
    List<Announcement> objects;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.announcement_layout, parent, false);
        TextView tvTitle = view.findViewById(R.id.tvTitle);
        TextView tvDescription = view.findViewById(R.id.tvDescription);
        ImageView announcementImage = view.findViewById(R.id.announcementImage);
        Announcement announcement = objects.get(position);
        tvTitle.setText(announcement.getTitle());
        tvDescription.setText(announcement.getDescription());
        announcementImage.setImageResource(announcement.getImageResource());

        return view;
    }



    public AnnouncementAdapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Announcement> objects) {
        super(context, resource, textViewResourceId, objects);
        this.context = context;
        this.objects = objects;

    }

    public static void openAnnouncementAsActivity(Context context, String title, String description, int imageResource) {
        Intent intent = new Intent(context, AnnouncementViewActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("imageResource", String.valueOf(imageResource));
        context.startActivity(intent);
    }

}
