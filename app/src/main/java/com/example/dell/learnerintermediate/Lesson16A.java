package com.example.dell.learnerintermediate;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by UCSC-PC on 6/4/2015.
 */
public class Lesson16A extends Fragment implements View.OnClickListener {

    static VideoView videoView = null;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fr_less_16_a, container, false);

        ImageButton button = (ImageButton) view.findViewById(R.id.playVideo);

        videoView = (VideoView) view.findViewById(R.id.less_16_a);
        MediaController mController = new MediaController(getActivity());
        mController.setAnchorView(videoView);
        Uri videoUri = Uri.parse("android.resource://com.example.dell.learnerintermediate/raw/less_16_a");
        videoView.setMediaController(mController);
        videoView.setVideoURI(videoUri);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                videoView.start();
            }
        });
        return view;

    }

    @Override
    public void onClick(View v) {

    }

    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (this.isVisible()) {
            if (!isVisibleToUser)   // If we are becoming invisible, then...
            {
                videoView.pause();
            }
        }
    }
}
