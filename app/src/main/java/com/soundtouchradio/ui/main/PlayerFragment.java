package com.soundtouchradio.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.soundtouchradio.R;

public class PlayerFragment extends Fragment {

    public PlayerFragment() {
        super(R.layout.fragment_player);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button openSenderList = view.findViewById(R.id.button_open_sender_list);
        openSenderList.setOnClickListener(v ->
                NavHostFragment.findNavController(PlayerFragment.this)
                        .navigate(R.id.action_playerFragment_to_senderListFragment));
    }
}
