package c1;

import androidx.room.h;
import g1.f;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0975a extends d {
    public AbstractC0975a(h hVar) {
        super(hVar);
    }

    protected abstract void g(f fVar, Object obj);

    public final void h(Object obj) {
        f a8 = a();
        try {
            g(a8, obj);
            a8.w0();
        } finally {
            f(a8);
        }
    }
}
