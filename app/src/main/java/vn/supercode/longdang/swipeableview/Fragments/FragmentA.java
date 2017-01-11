package vn.supercode.longdang.swipeableview.Fragments;

import android.os.Bundle;import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.supercode.longdang.swipeableview.R;

/**
 * Created by LONGDANG on 1/3/2017.
 */

public class FragmentA extends Fragment {
    public FragmentA() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }
}
