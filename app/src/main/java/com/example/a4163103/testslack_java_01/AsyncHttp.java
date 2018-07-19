package com.example.a4163103.testslack_java_01;

import android.app.Activity;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import java.util.List;

import allbegray.slack.SlackClientFactory;
import allbegray.slack.type.Channel;
import allbegray.slack.webapi.SlackWebApiClient;

public class AsyncHttp extends AsyncTask<Uri.Builder, Void, String> {

    private String token = "";      //自分のワークスペースのトークン
    private SlackWebApiClient webApiClient;

    private Activity activity;

    public AsyncHttp(MainActivity mainActivity) {

        this.activity = mainActivity;

    }

    @Override
    protected String doInBackground(Uri.Builder... builders) {

        webApiClient = SlackClientFactory.createWebApiClient(token);
        //  チャンネルID、メッセージ、, s2は botの名前だった　,trueだと自分の名前　falseにするとbotの名前が適用される

        webApiClient.postMessage("","sakazon","",true);

        //List<Channel> getChannelList();
        Log.i("dtheth", String.valueOf(webApiClient.getChannelList()));
        Log.i("sdfd", String.valueOf(webApiClient.getUserList()));

        return null;
    }



}
