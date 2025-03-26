package com.bumptech.glide.load.engine;

import P1.n;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class c implements f, d.a {

    /* renamed from: o, reason: collision with root package name */
    private final List f12665o;

    /* renamed from: s, reason: collision with root package name */
    private final g f12666s;

    /* renamed from: t, reason: collision with root package name */
    private final f.a f12667t;

    /* renamed from: u, reason: collision with root package name */
    private int f12668u;

    /* renamed from: v, reason: collision with root package name */
    private J1.e f12669v;

    /* renamed from: w, reason: collision with root package name */
    private List f12670w;

    /* renamed from: x, reason: collision with root package name */
    private int f12671x;

    /* renamed from: y, reason: collision with root package name */
    private volatile n.a f12672y;

    /* renamed from: z, reason: collision with root package name */
    private File f12673z;

    c(g gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean b() {
        return this.f12671x < this.f12670w.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (b() == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        r0 = r7.f12670w;
        r3 = r7.f12671x;
        r7.f12671x = r3 + 1;
        r7.f12672y = ((P1.n) r0.get(r3)).a(r7.f12673z, r7.f12666s.t(), r7.f12666s.f(), r7.f12666s.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r7.f12672y == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r7.f12666s.u(r7.f12672y.f4353c.a()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r7.f12672y.f4353c.e(r7.f12666s.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r7.f12672y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r2 != false) goto L40;
     */
    @Override // com.bumptech.glide.load.engine.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            e2.AbstractC5743b.a(r0)
        L5:
            java.util.List r0 = r7.f12670w     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6e
            boolean r0 = r7.b()     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L12
            goto L6e
        L12:
            r0 = 0
            r7.f12672y = r0     // Catch: java.lang.Throwable -> L68
        L15:
            if (r2 != 0) goto L6a
            boolean r0 = r7.b()     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L6a
            java.util.List r0 = r7.f12670w     // Catch: java.lang.Throwable -> L68
            int r3 = r7.f12671x     // Catch: java.lang.Throwable -> L68
            int r4 = r3 + 1
            r7.f12671x = r4     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L68
            P1.n r0 = (P1.n) r0     // Catch: java.lang.Throwable -> L68
            java.io.File r3 = r7.f12673z     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r4 = r7.f12666s     // Catch: java.lang.Throwable -> L68
            int r4 = r4.t()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r5 = r7.f12666s     // Catch: java.lang.Throwable -> L68
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r6 = r7.f12666s     // Catch: java.lang.Throwable -> L68
            J1.h r6 = r6.k()     // Catch: java.lang.Throwable -> L68
            P1.n$a r0 = r0.a(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L68
            r7.f12672y = r0     // Catch: java.lang.Throwable -> L68
            P1.n$a r0 = r7.f12672y     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            com.bumptech.glide.load.engine.g r0 = r7.f12666s     // Catch: java.lang.Throwable -> L68
            P1.n$a r3 = r7.f12672y     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r3 = r3.f4353c     // Catch: java.lang.Throwable -> L68
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> L68
            boolean r0 = r0.u(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L15
            P1.n$a r0 = r7.f12672y     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.data.d r0 = r0.f4353c     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r2 = r7.f12666s     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.g r2 = r2.l()     // Catch: java.lang.Throwable -> L68
            r0.e(r2, r7)     // Catch: java.lang.Throwable -> L68
            r2 = r1
            goto L15
        L68:
            r0 = move-exception
            goto Lb0
        L6a:
            e2.AbstractC5743b.e()
            return r2
        L6e:
            int r0 = r7.f12668u     // Catch: java.lang.Throwable -> L68
            int r0 = r0 + r1
            r7.f12668u = r0     // Catch: java.lang.Throwable -> L68
            java.util.List r1 = r7.f12665o     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r0 < r1) goto L7f
            e2.AbstractC5743b.e()
            return r2
        L7f:
            java.util.List r0 = r7.f12665o     // Catch: java.lang.Throwable -> L68
            int r1 = r7.f12668u     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L68
            J1.e r0 = (J1.e) r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.d r1 = new com.bumptech.glide.load.engine.d     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r3 = r7.f12666s     // Catch: java.lang.Throwable -> L68
            J1.e r3 = r3.p()     // Catch: java.lang.Throwable -> L68
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r3 = r7.f12666s     // Catch: java.lang.Throwable -> L68
            N1.a r3 = r3.d()     // Catch: java.lang.Throwable -> L68
            java.io.File r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L68
            r7.f12673z = r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L5
            r7.f12669v = r0     // Catch: java.lang.Throwable -> L68
            com.bumptech.glide.load.engine.g r0 = r7.f12666s     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L68
            r7.f12670w = r0     // Catch: java.lang.Throwable -> L68
            r7.f12671x = r2     // Catch: java.lang.Throwable -> L68
            goto L5
        Lb0:
            e2.AbstractC5743b.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.c.a():boolean");
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        this.f12667t.f(this.f12669v, exc, this.f12672y.f4353c, J1.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a aVar = this.f12672y;
        if (aVar != null) {
            aVar.f4353c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f12667t.c(this.f12669v, obj, this.f12672y.f4353c, J1.a.DATA_DISK_CACHE, this.f12669v);
    }

    c(List list, g gVar, f.a aVar) {
        this.f12668u = -1;
        this.f12665o = list;
        this.f12666s = gVar;
        this.f12667t = aVar;
    }
}
