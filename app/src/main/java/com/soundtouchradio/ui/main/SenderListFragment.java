package com.soundtouchradio.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.soundtouchradio.R;

public class SenderListFragment extends Fragment {

    public SenderListFragment() {
        super(R.layout.fragmentsenderlist);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button backToPlayer = view.findViewById(R.id.button_back_to_player);
        backToPlayer.setOnClickListener(v ->
                NavHostFragment.findNavController(SenderListFragment.this)
                        .navigate(R.id.action_senderListFragment_to_playerFragment));
    }
}
