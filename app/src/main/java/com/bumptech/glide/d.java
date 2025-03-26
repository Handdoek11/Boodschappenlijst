package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import d2.AbstractC5704f;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    static final l f12537k = new a();

    /* renamed from: a, reason: collision with root package name */
    private final M1.b f12538a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5704f.b f12539b;

    /* renamed from: c, reason: collision with root package name */
    private final a2.f f12540c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a f12541d;

    /* renamed from: e, reason: collision with root package name */
    private final List f12542e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f12543f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f12544g;

    /* renamed from: h, reason: collision with root package name */
    private final e f12545h;

    /* renamed from: i, reason: collision with root package name */
    private final int f12546i;

    /* renamed from: j, reason: collision with root package name */
    private Z1.f f12547j;

    public d(Context context, M1.b bVar, AbstractC5704f.b bVar2, a2.f fVar, b.a aVar, Map map, List list, com.bumptech.glide.load.engine.j jVar, e eVar, int i8) {
        super(context.getApplicationContext());
        this.f12538a = bVar;
        this.f12540c = fVar;
        this.f12541d = aVar;
        this.f12542e = list;
        this.f12543f = map;
        this.f12544g = jVar;
        this.f12545h = eVar;
        this.f12546i = i8;
        this.f12539b = AbstractC5704f.a(bVar2);
    }

    public a2.i a(ImageView imageView, Class cls) {
        return this.f12540c.a(imageView, cls);
    }

    public M1.b b() {
        return this.f12538a;
    }

    public List c() {
        return this.f12542e;
    }

    public synchronized Z1.f d() {
        try {
            if (this.f12547j == null) {
                this.f12547j = (Z1.f) this.f12541d.a().T();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12547j;
    }

    public l e(Class cls) {
        l lVar = (l) this.f12543f.get(cls);
        if (lVar == null) {
            for (Map.Entry entry : this.f12543f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? f12537k : lVar;
    }

    public com.bumptech.glide.load.engine.j f() {
        return this.f12544g;
    }

    public e g() {
        return this.f12545h;
    }

    public int h() {
        return this.f12546i;
    }

    public Registry i() {
        return (Registry) this.f12539b.get();
    }
}
