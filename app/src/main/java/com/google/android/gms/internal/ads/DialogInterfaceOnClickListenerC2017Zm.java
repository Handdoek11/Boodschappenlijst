package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* renamed from: com.google.android.gms.internal.ads.Zm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC2017Zm implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f20545o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ String f20546s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ C2223bn f20547t;

    DialogInterfaceOnClickListenerC2017Zm(C2223bn c2223bn, String str, String str2) {
        this.f20545o = str;
        this.f20546s = str2;
        this.f20547t = c2223bn;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        DownloadManager downloadManager = (DownloadManager) this.f20547t.f20934d.getSystemService("download");
        try {
            String str = this.f20545o;
            String str2 = this.f20546s;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            C2.v.t();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f20547t.c("Could not store picture.");
        }
    }
}
