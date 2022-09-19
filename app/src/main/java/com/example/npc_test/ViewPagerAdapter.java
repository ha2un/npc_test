package com.example.npc_test;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    //프래그먼트 교체를 보여주는 곳//
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragHome.newinstant();
            case 1:
                return FragCommunity.newinstant();
            case 2:
                return FragTrashInfo.newinstant();
            case 3:
                return FragMyInfo.newinstant();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    //하단의 탭 레이아웃 인디케이터 쪽 텍스트 선언하는 곳//
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "홈";
            case 1:
                return "커뮤니티";
            case 2:
                return "쓰레기 정보";
            case 3:
                return "내 정보";
            default:
                return null;
        }
    }
}
