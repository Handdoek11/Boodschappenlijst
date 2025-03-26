package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.manager.b;

/* loaded from: classes.dex */
final class d implements b {

    /* renamed from: o, reason: collision with root package name */
    private final Context f12976o;

    /* renamed from: s, reason: collision with root package name */
    final b.a f12977s;

    d(Context context, b.a aVar) {
        this.f12976o = context.getApplicationContext();
        this.f12977s = aVar;
    }

    private void k() {
        q.a(this.f12976o).d(this.f12977s);
    }

    private void l() {
        q.a(this.f12976o).e(this.f12977s);
    }

    @Override // com.bumptech.glide.manager.k
    public void a() {
        k();
    }

    @Override // com.bumptech.glide.manager.k
    public void f() {
        l();
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }
}
