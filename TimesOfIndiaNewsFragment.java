package com.example.newsappitsumaircode.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsappitsumaircode.R;
import com.example.newsappitsumaircode.WebViewController;

public class TimesOfIndiaNewsFragment extends Fragment {

    WebView webView;

    public TimesOfIndiaNewsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root =  inflater.inflate(R.layout.fragment_times_of_india_news, container, false);

        webView = root.findViewById(R.id.toi_webView);
        webView.loadUrl("https://timesofindia.indiatimes.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}