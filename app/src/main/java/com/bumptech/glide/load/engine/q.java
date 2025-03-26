package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.i;
import d2.AbstractC5709k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Class f12833a;

    /* renamed from: b, reason: collision with root package name */
    private final y0.f f12834b;

    /* renamed from: c, reason: collision with root package name */
    private final List f12835c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12836d;

    public q(Class cls, Class cls2, Class cls3, List list, y0.f fVar) {
        this.f12833a = cls;
        this.f12834b = fVar;
        this.f12835c = (List) AbstractC5709k.c(list);
        this.f12836d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private L1.c b(com.bumptech.glide.load.data.e eVar, J1.h hVar, int i8, int i9, i.a aVar, List list) {
        int size = this.f12835c.size();
        L1.c cVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            try {
                cVar = ((i) this.f12835c.get(i10)).a(eVar, i8, i9, hVar, aVar);
            } catch (GlideException e8) {
                list.add(e8);
            }
            if (cVar != null) {
                break;
            }
        }
        if (cVar != null) {
            return cVar;
        }
        throw new GlideException(this.f12836d, new ArrayList(list));
    }

    public L1.c a(com.bumptech.glide.load.data.e eVar, J1.h hVar, int i8, int i9, i.a aVar) {
        List list = (List) AbstractC5709k.d(this.f12834b.b());
        try {
            return b(eVar, hVar, i8, i9, aVar, list);
        } finally {
            this.f12834b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f12835c.toArray()) + '}';
    }
}
