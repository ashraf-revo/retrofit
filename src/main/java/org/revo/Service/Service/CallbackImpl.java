package org.revo.Service.Service;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by revo on 5/7/16.
 */
public abstract class CallbackImpl<T> implements Callback<T> {
    public abstract void data(T t);

    public void error(int code) {
        System.out.println(code);
    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.body() != null || response.code() == 204)
            data(response.body());
        else error(response.code());
    }

    @Override
    public void onFailure(Call<T> call, Throwable throwable) {
        System.out.println(throwable.getMessage());
    }
}
