package com.bumptech.glide.load.engine;

import P1.n;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import e2.AbstractC5743b;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class s implements f, d.a {

    /* renamed from: A, reason: collision with root package name */
    private t f12842A;

    /* renamed from: o, reason: collision with root package name */
    private final f.a f12843o;

    /* renamed from: s, reason: collision with root package name */
    private final g f12844s;

    /* renamed from: t, reason: collision with root package name */
    private int f12845t;

    /* renamed from: u, reason: collision with root package name */
    private int f12846u = -1;

    /* renamed from: v, reason: collision with root package name */
    private J1.e f12847v;

    /* renamed from: w, reason: collision with root package name */
    private List f12848w;

    /* renamed from: x, reason: collision with root package name */
    private int f12849x;

    /* renamed from: y, reason: collision with root package name */
    private volatile n.a f12850y;

    /* renamed from: z, reason: collision with root package name */
    private File f12851z;

    s(g gVar, f.a aVar) {
        this.f12844s = gVar;
        this.f12843o = aVar;
    }

    private boolean b() {
        return this.f12849x < this.f12848w.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        AbstractC5743b.a("ResourceCacheGenerator.startNext");
        try {
            List c8 = this.f12844s.c();
            boolean z7 = false;
            if (c8.isEmpty()) {
                AbstractC5743b.e();
                return false;
            }
            List m8 = this.f12844s.m();
            if (m8.isEmpty()) {
                if (File.class.equals(this.f12844s.r())) {
                    AbstractC5743b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f12844s.i() + " to " + this.f12844s.r());
            }
            while (true) {
                if (this.f12848w != null && b()) {
                    this.f12850y = null;
                    while (!z7 && b()) {
                        List list = this.f12848w;
                        int i8 = this.f12849x;
                        this.f12849x = i8 + 1;
                        this.f12850y = ((P1.n) list.get(i8)).a(this.f12851z, this.f12844s.t(), this.f12844s.f(), this.f12844s.k());
                        if (this.f12850y != null && this.f12844s.u(this.f12850y.f4353c.a())) {
                            this.f12850y.f4353c.e(this.f12844s.l(), this);
                            z7 = true;
                        }
                    }
                    AbstractC5743b.e();
                    return z7;
                }
                int i9 = this.f12846u + 1;
                this.f12846u = i9;
                if (i9 >= m8.size()) {
                    int i10 = this.f12845t + 1;
                    this.f12845t = i10;
                    if (i10 >= c8.size()) {
                        AbstractC5743b.e();
                        return false;
                    }
                    this.f12846u = 0;
                }
                J1.e eVar = (J1.e) c8.get(this.f12845t);
                Class cls = (Class) m8.get(this.f12846u);
                this.f12842A = new t(this.f12844s.b(), eVar, this.f12844s.p(), this.f12844s.t(), this.f12844s.f(), this.f12844s.s(cls), cls, this.f12844s.k());
                File a8 = this.f12844s.d().a(this.f12842A);
                this.f12851z = a8;
                if (a8 != null) {
                    this.f12847v = eVar;
                    this.f12848w = this.f12844s.j(a8);
                    this.f12849x = 0;
                }
            }
        } catch (Throwable th) {
            AbstractC5743b.e();
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f12843o.f(this.f12842A, exc, this.f12850y.f4353c, J1.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a aVar = this.f12850y;
        if (aVar != null) {
            aVar.f4353c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f12843o.c(this.f12847v, obj, this.f12850y.f4353c, J1.a.RESOURCE_DISK_CACHE, this.f12842A);
    }
}
