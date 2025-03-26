package com.bumptech.glide;

import P1.o;
import P1.p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.q;
import e2.AbstractC5742a;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Registry {

    /* renamed from: a, reason: collision with root package name */
    private final p f12497a;

    /* renamed from: b, reason: collision with root package name */
    private final Y1.a f12498b;

    /* renamed from: c, reason: collision with root package name */
    private final Y1.e f12499c;

    /* renamed from: d, reason: collision with root package name */
    private final Y1.f f12500d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f12501e;

    /* renamed from: f, reason: collision with root package name */
    private final W1.f f12502f;

    /* renamed from: g, reason: collision with root package name */
    private final Y1.b f12503g;

    /* renamed from: h, reason: collision with root package name */
    private final Y1.d f12504h = new Y1.d();

    /* renamed from: i, reason: collision with root package name */
    private final Y1.c f12505i = new Y1.c();

    /* renamed from: j, reason: collision with root package name */
    private final y0.f f12506j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public NoModelLoaderAvailableException(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        y0.f e8 = AbstractC5742a.e();
        this.f12506j = e8;
        this.f12497a = new p(e8);
        this.f12498b = new Y1.a();
        this.f12499c = new Y1.e();
        this.f12500d = new Y1.f();
        this.f12501e = new com.bumptech.glide.load.data.f();
        this.f12502f = new W1.f();
        this.f12503g = new Y1.b();
        r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f12499c.d(cls, cls2)) {
            for (Class cls5 : this.f12502f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f12499c.b(cls, cls4), this.f12502f.a(cls4, cls5), this.f12506j));
            }
        }
        return arrayList;
    }

    public Registry a(Class cls, J1.d dVar) {
        this.f12498b.a(cls, dVar);
        return this;
    }

    public Registry b(Class cls, J1.k kVar) {
        this.f12500d.a(cls, kVar);
        return this;
    }

    public Registry c(Class cls, Class cls2, J1.j jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public Registry d(Class cls, Class cls2, o oVar) {
        this.f12497a.a(cls, cls2, oVar);
        return this;
    }

    public Registry e(String str, Class cls, Class cls2, J1.j jVar) {
        this.f12499c.a(str, jVar, cls, cls2);
        return this;
    }

    public List g() {
        List b8 = this.f12503g.b();
        if (b8.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return b8;
    }

    public q h(Class cls, Class cls2, Class cls3) {
        q a8 = this.f12505i.a(cls, cls2, cls3);
        if (this.f12505i.c(a8)) {
            return null;
        }
        if (a8 == null) {
            List f8 = f(cls, cls2, cls3);
            a8 = f8.isEmpty() ? null : new q(cls, cls2, cls3, f8, this.f12506j);
            this.f12505i.d(cls, cls2, cls3, a8);
        }
        return a8;
    }

    public List i(Object obj) {
        return this.f12497a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List a8 = this.f12504h.a(cls, cls2, cls3);
        if (a8 == null) {
            a8 = new ArrayList();
            Iterator it = this.f12497a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f12499c.d((Class) it.next(), cls2)) {
                    if (!this.f12502f.b(cls4, cls3).isEmpty() && !a8.contains(cls4)) {
                        a8.add(cls4);
                    }
                }
            }
            this.f12504h.b(cls, cls2, cls3, DesugarCollections.unmodifiableList(a8));
        }
        return a8;
    }

    public J1.k k(L1.c cVar) {
        J1.k b8 = this.f12500d.b(cVar.d());
        if (b8 != null) {
            return b8;
        }
        throw new NoResultEncoderAvailableException(cVar.d());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f12501e.a(obj);
    }

    public J1.d m(Object obj) {
        J1.d b8 = this.f12498b.b(obj.getClass());
        if (b8 != null) {
            return b8;
        }
        throw new NoSourceEncoderAvailableException(obj.getClass());
    }

    public boolean n(L1.c cVar) {
        return this.f12500d.b(cVar.d()) != null;
    }

    public Registry o(ImageHeaderParser imageHeaderParser) {
        this.f12503g.a(imageHeaderParser);
        return this;
    }

    public Registry p(e.a aVar) {
        this.f12501e.b(aVar);
        return this;
    }

    public Registry q(Class cls, Class cls2, W1.e eVar) {
        this.f12502f.c(cls, cls2, eVar);
        return this;
    }

    public final Registry r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f12499c.e(arrayList);
        return this;
    }
}
