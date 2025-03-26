package com.bumptech.glide.load.engine;

import N1.a;
import java.io.File;

/* loaded from: classes.dex */
class e implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private final J1.d f12676a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f12677b;

    /* renamed from: c, reason: collision with root package name */
    private final J1.h f12678c;

    e(J1.d dVar, Object obj, J1.h hVar) {
        this.f12676a = dVar;
        this.f12677b = obj;
        this.f12678c = hVar;
    }

    @Override // N1.a.b
    public boolean a(File file) {
        return this.f12676a.a(this.f12677b, file, this.f12678c);
    }
}
