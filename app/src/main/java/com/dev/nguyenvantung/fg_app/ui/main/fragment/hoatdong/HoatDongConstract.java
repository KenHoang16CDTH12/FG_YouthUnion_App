package com.dev.nguyenvantung.fg_app.ui.main.fragment.hoatdong;



import android.view.View;

import com.dev.nguyenvantung.fg_app.data.model.hoatdong.HoatDong;

import java.util.List;

public interface HoatDongConstract {
    interface View{
        void setListHoatDong(List<HoatDong> listHoatDong);
    }

    interface Presenter{
        void listHoatDong(String token);
        void setView(HoatDongConstract.View view);
    }
}
