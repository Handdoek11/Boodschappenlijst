package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements d {

    /* renamed from: o, reason: collision with root package name */
    private final String f12616o;

    /* renamed from: s, reason: collision with root package name */
    private final AssetManager f12617s;

    /* renamed from: t, reason: collision with root package name */
    private Object f12618t;

    public b(AssetManager assetManager, String str) {
        this.f12617s = assetManager;
        this.f12616o = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        Object obj = this.f12618t;
        if (obj == null) {
            return;
        }
        try {
            c(obj);
        } catch (IOException unused) {
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
    public void e(com.bumptech.glide.g gVar, d.a aVar) {
        try {
            Object f8 = f(this.f12617s, this.f12616o);
            this.f12618t = f8;
            aVar.f(f8);
        } catch (IOException e8) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e8);
            }
            aVar.c(e8);
        }
    }

    protected abstract Object f(AssetManager assetManager, String str);
}
