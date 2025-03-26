package a2;

import android.graphics.drawable.Drawable;
import d2.AbstractC5710l;

/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0811c implements h {

    /* renamed from: o, reason: collision with root package name */
    private final int f6523o;

    /* renamed from: s, reason: collision with root package name */
    private final int f6524s;

    /* renamed from: t, reason: collision with root package name */
    private Z1.c f6525t;

    public AbstractC0811c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // a2.h
    public final void c(Z1.c cVar) {
        this.f6525t = cVar;
    }

    @Override // a2.h
    public final void d(g gVar) {
        gVar.d(this.f6523o, this.f6524s);
    }

    @Override // a2.h
    public final Z1.c i() {
        return this.f6525t;
    }

    public AbstractC0811c(int i8, int i9) {
        if (AbstractC5710l.u(i8, i9)) {
            this.f6523o = i8;
            this.f6524s = i9;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i8 + " and height: " + i9);
    }

    @Override // com.bumptech.glide.manager.k
    public void a() {
    }

    @Override // com.bumptech.glide.manager.k
    public void f() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // a2.h
    public final void b(g gVar) {
    }

    @Override // a2.h
    public void e(Drawable drawable) {
    }

    @Override // a2.h
    public void h(Drawable drawable) {
    }
}
