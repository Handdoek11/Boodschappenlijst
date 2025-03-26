package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l implements d {

    /* renamed from: o, reason: collision with root package name */
    private final Uri f12640o;

    /* renamed from: s, reason: collision with root package name */
    private final ContentResolver f12641s;

    /* renamed from: t, reason: collision with root package name */
    private Object f12642t;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f12641s = contentResolver;
        this.f12640o = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f12642t;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    protected abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public J1.a d() {
        return J1.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.g gVar, d.a aVar) {
        try {
            Object f8 = f(this.f12640o, this.f12641s);
            this.f12642t = f8;
            aVar.f(f8);
        } catch (FileNotFoundException e8) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e8);
            }
            aVar.c(e8);
        }
    }

    protected abstract Object f(Uri uri, ContentResolver contentResolver);
}
