package com.example.newsappitsumaircode.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.newsappitsumaircode.R;
import com.example.newsappitsumaircode.WebViewController;

public class News18Fragment extends Fragment {

    WebView webView;

    public News18Fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root =  inflater.inflate(R.layout.fragment_news_18, container, false);

        webView = root.findViewById(R.id.news_18_webView);
        webView.loadUrl("https://www.news18.com/");
        webView.setWebViewClient(new WebViewController());

        return root;
    }
}