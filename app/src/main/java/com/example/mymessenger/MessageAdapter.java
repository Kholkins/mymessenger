package com.example.mymessenger;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<AwesomeMessage> {

    public MessageAdapter(@NonNull Context context, int resource, List<AwesomeMessage> messages) {
        super(context, resource, messages);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            convertView = ((Activity)getContext()).getLayoutInflater().inflate(R.layout.message_item,parent,false);
        }
        ImageView imageViewPhoto = convertView.findViewById(R.id.photoImageView);
        TextView textViewText = convertView.findViewById(R.id.textTextView);
        TextView textViewName = convertView.findViewById(R.id.nameTextView);

        AwesomeMessage message = getItem(position);

        boolean isText = message.getImageURL() == null;

        if (isText) {
            textViewText.setVisibility(View.VISIBLE);
            imageViewPhoto.setVisibility(View.GONE);
            textViewText.setText(message.getText());
        }else {
            textViewText.setVisibility(View.GONE);
            imageViewPhoto.setVisibility(View.VISIBLE);
            Glide.with(imageViewPhoto.getContext()).load(message.getImageURL()).into(imageViewPhoto);
        }

        textViewName.setText(message.getName());

        return convertView;
    }
}
