package com.alain.cursos.mdcomponents.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alain.cursos.mdcomponents.R;
import com.alain.cursos.mdcomponents.utils.Component;
import com.alain.cursos.mdcomponents.utils.Constants;
import com.google.android.material.badge.BadgeDrawable;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class BottomNavigationBarFragment extends Fragment {



    public static final String TAG = "Bottom Navigation";

    private static Component mInstance;
    Unbinder mUnbinder;

    public static Component getmInstance() {
        mInstance = new Component();
        mInstance.setName(TAG);
        mInstance.setPhotoRes(R.drawable.img_bottomnav_mobile_portrait);
        mInstance.setType(Constants.STATIC);
        return mInstance;
    }



    public BottomNavigationBarFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom_navigation_bar, container, false)
        mUnbinder = ButterKnife.bind(this,view);

        bottonNavigation.getOrCreateBadge(R.id.action_start);
       // bottonNavigation.removeBadge(R.id.action_start);

        BadgeDrawable favoriteBadge = bottonNavigation.getOrcreateBadge(R.id.action_favorites);
        favoriteBadge.setNumber(21);

        BadgeDrawable profileBadge = bottonNavigation.getOrcreateBadge(R.id.action_profile);
        profileBadge.setNumber(999);
        profileBadge.setMaxCharacterCount(3);
        profileBadge.setBackgroundColor(color.CYAN);
        profileBadge.setBadgeTextColor(color.MAGENTA);

        return  view;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }
}


