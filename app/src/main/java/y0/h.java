package y0;

import J6.r;

/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: c, reason: collision with root package name */
    private final Object f44529c;

    public h(int i8) {
        super(i8);
        this.f44529c = new Object();
    }

    @Override // y0.g, y0.f
    public boolean a(Object obj) {
        boolean a8;
        r.e(obj, "instance");
        synchronized (this.f44529c) {
            a8 = super.a(obj);
        }
        return a8;
    }

    @Override // y0.g, y0.f
    public Object b() {
        Object b8;
        synchronized (this.f44529c) {
            b8 = super.b();
        }
        return b8;
    }
}
