package com.alexandree.ktoplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webview)

        webView.settings.javaScriptEnabled = true
        webView.settings.mediaPlaybackRequiresUserGesture = false

        val htmlContent = """
            <!DOCTYPE html>
            <html lang="fr">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Lecture HLS - KTO</title>
                <link href="https://vjs.zencdn.net/7.21.0/video-js.css" rel="stylesheet">
                <script src="https://vjs.zencdn.net/7.21.0/video.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/videojs-contrib-hls@5.16.0/dist/videojs-contrib-hls.min.js"></script>
                <style>
                    body, html { margin: 0; padding: 0; height: 100%; width: 100%; overflow: hidden; }
                    #video-player { width: 100%; height: 100%; }
                    
                    /* Masquer l'image de pré-chargement */
                    .vjs-poster {
                        display: none;
                    }

                    /* Masquer le bouton play */
                    .vjs-big-play-button {
                        display: none;
                    }
                </style>
            </head>
            <body>
                <video id="video-player" class="video-js vjs-default-skin" preload="auto" autoplay poster="https://raw.githubusercontent.com/alexodee/iptvlist/refs/heads/main/banner-loading-new.png">
                    <source src="https://live-kto.akamaized.net/hls/live/2033284/KTO/master.m3u8" type="application/x-mpegURL">
                </video>
                <script>
                    var player = videojs('video-player', {
                        controls: false,  // Masque les contrôles
                        autoplay: true,
                        preload: 'auto',
                        muted: false,
                        volume: 1,
                        fluid: true,
                        playInline: true,
                    });
                    player.controlBar.volumePanel.hide();
                    player.ready(function() {
                        var videoElement = player.el();
                        document.getElementById('video-player').addEventListener('click', function () {
                            if (videoElement.requestFullscreen) {
                                videoElement.requestFullscreen();
                            } else if (videoElement.mozRequestFullScreen) {
                                videoElement.mozRequestFullScreen();
                            } else if (videoElement.webkitRequestFullscreen) {
                                videoElement.webkitRequestFullscreen();
                            } else if (videoElement.msRequestFullscreen) {
                                videoElement.msRequestFullscreen();
                            }
                        });
                    });
                </script>
            </body>
            </html>
        """

        webView.loadDataWithBaseURL(null, htmlContent, "text/html", "UTF-8", null)
        webView.webViewClient = WebViewClient()
    }
}
