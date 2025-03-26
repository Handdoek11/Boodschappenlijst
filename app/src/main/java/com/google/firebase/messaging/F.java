package com.google.firebase.messaging;

import A3.AbstractC0376j;
import A3.C0377k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class F implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    private final URL f32850o;

    /* renamed from: s, reason: collision with root package name */
    private volatile Future f32851s;

    /* renamed from: t, reason: collision with root package name */
    private AbstractC0376j f32852t;

    private F(URL url) {
        this.f32850o = url;
    }

    private byte[] f() {
        URLConnection openConnection = this.f32850o.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] d8 = AbstractC5476b.d(AbstractC5476b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + d8.length + " bytes from " + this.f32850o);
            }
            if (d8.length <= 1048576) {
                return d8;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static F g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new F(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(C0377k c0377k) {
        try {
            c0377k.c(e());
        } catch (Exception e8) {
            c0377k.b(e8);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32851s.cancel(true);
    }

    public Bitmap e() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f32850o);
        }
        byte[] f8 = f();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(f8, 0, f8.length);
        if (decodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f32850o);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f32850o);
        }
        return decodeByteArray;
    }

    public AbstractC0376j h() {
        return (AbstractC0376j) Z2.r.l(this.f32852t);
    }

    public void j(ExecutorService executorService) {
        final C0377k c0377k = new C0377k();
        this.f32851s = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.E
            @Override // java.lang.Runnable
            public final void run() {
                this.f32848o.i(c0377k);
            }
        });
        this.f32852t = c0377k.a();
    }
}
