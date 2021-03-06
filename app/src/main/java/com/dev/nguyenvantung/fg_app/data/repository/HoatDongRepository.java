package com.dev.nguyenvantung.fg_app.data.repository;

import com.dev.nguyenvantung.fg_app.data.source.HoatDongDataSource;
import com.dev.nguyenvantung.fg_app.data.source.remote.response.hoatdong.HoatDongResponse;

import io.reactivex.Single;

public class HoatDongRepository implements HoatDongDataSource.LocalDataSource, HoatDongDataSource.RemoteDataSource{
    private HoatDongDataSource.LocalDataSource mLocalDataSource;
    private HoatDongDataSource.RemoteDataSource mRemoteDataSource;

    public HoatDongRepository(HoatDongDataSource.LocalDataSource localDataSource, HoatDongDataSource.RemoteDataSource remoteDataSource) {
        this.mLocalDataSource = localDataSource;
        this.mRemoteDataSource =remoteDataSource;
    }

    @Override
    public Single<HoatDongResponse> listHoatDong(String token) {
        return mRemoteDataSource.listHoatDong(token);
    }
}
