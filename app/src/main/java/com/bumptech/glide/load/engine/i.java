package com.bumptech.glide.load.engine;

import android.util.Log;
import d2.AbstractC5709k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Class f12751a;

    /* renamed from: b, reason: collision with root package name */
    private final List f12752b;

    /* renamed from: c, reason: collision with root package name */
    private final W1.e f12753c;

    /* renamed from: d, reason: collision with root package name */
    private final y0.f f12754d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12755e;

    interface a {
        L1.c a(L1.c cVar);
    }

    public i(Class cls, Class cls2, Class cls3, List list, W1.e eVar, y0.f fVar) {
        this.f12751a = cls;
        this.f12752b = list;
        this.f12753c = eVar;
        this.f12754d = fVar;
        this.f12755e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private L1.c b(com.bumptech.glide.load.data.e eVar, int i8, int i9, J1.h hVar) {
        List list = (List) AbstractC5709k.d(this.f12754d.b());
        try {
            return c(eVar, i8, i9, hVar, list);
        } finally {
            this.f12754d.a(list);
        }
    }

    private L1.c c(com.bumptech.glide.load.data.e eVar, int i8, int i9, J1.h hVar, List list) {
        int size = this.f12752b.size();
        L1.c cVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            J1.j jVar = (J1.j) this.f12752b.get(i10);
            try {
                if (jVar.b(eVar.a(), hVar)) {
                    cVar = jVar.a(eVar.a(), i8, i9, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e8) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e8);
                }
                list.add(e8);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f12755e, new ArrayList(list));
    }

    public L1.c a(com.bumptech.glide.load.data.e eVar, int i8, int i9, J1.h hVar, a aVar) {
        return this.f12753c.a(aVar.a(b(eVar, i8, i9, hVar)), hVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f12751a + ", decoders=" + this.f12752b + ", transcoder=" + this.f12753c + '}';
    }
}
