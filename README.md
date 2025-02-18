# KTOPlayer - Français 🇫🇷

![KTOPlayer Banner](https://github.com/alexodee/ktoplayer/blob/main/app/src/main/res/mipmap-xxhdpi/banner.png)

**Un lecteur Android TV simple pour KTO, une chaîne chrétienne française.**

L'APK est disponible dans les **releases** de ce dépôt. Vous pouvez télécharger la dernière version à partir du lien ci-dessous :
[Dernière release](https://github.com/alexodee/ktoplayer/releases/latest)

## Fonctionnement de l'Application

L'application **KTOPlayer** utilise une **WebView** pour afficher un lecteur vidéo basé sur **Video.js**. Ce lecteur est intégré dans une interface minimaliste sans contrôles visibles et se lance directement en mode plein écran dès que l'utilisateur clique sur la vidéo. Le flux vidéo est diffusé via **HLS** (HTTP Live Streaming) depuis l'URL de KTO.

Le code charge une page HTML qui inclut les éléments suivants :
- Un lecteur vidéo personnalisé avec Video.js.
- Un script pour activer la lecture en plein écran sur clic.
- Une image de pré-chargement pendant que la vidéo se charge.

La page est intégrée dans une **WebView** sur Android, ce qui permet de gérer l'affichage du flux vidéo directement dans l'application Android TV.
<br>
<br>
<br>
<br>
<br>
# KTOPlayer - English  🇬🇧

A simple Android TV player for KTO, a French Christian TV channel.

The APK is available in the **releases** of this repository. You can download the latest version from the link below:
[Latest release](https://github.com/alexodee/ktoplayer/releases/latest)

## How the Application Works

The **KTOPlayer** app uses a **WebView** to display a video player based on **Video.js**. This player is embedded in a minimalist interface with no visible controls and automatically launches in fullscreen mode when the user clicks on the video. The video stream is broadcast via **HLS** (HTTP Live Streaming) from the KTO URL.

The code loads an HTML page which includes the following elements:
- A custom video player with Video.js.
- A script to enable fullscreen playback on click.
- A loading image displayed while the video loads.

The page is embedded in a **WebView** on Android, which allows the video stream to be displayed directly within the Android TV app.
