package d2;

import q.C6397a;
import q.C6407k;

/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5700b extends C6397a {

    /* renamed from: x, reason: collision with root package name */
    private int f35209x;

    @Override // q.C6407k, java.util.Map
    public void clear() {
        this.f35209x = 0;
        super.clear();
    }

    @Override // q.C6407k
    public void h(C6407k c6407k) {
        this.f35209x = 0;
        super.h(c6407k);
    }

    @Override // q.C6407k, java.util.Map
    public int hashCode() {
        if (this.f35209x == 0) {
            this.f35209x = super.hashCode();
        }
        return this.f35209x;
    }

    @Override // q.C6407k
    public Object i(int i8) {
        this.f35209x = 0;
        return super.i(i8);
    }

    @Override // q.C6407k
    public Object j(int i8, Object obj) {
        this.f35209x = 0;
        return super.j(i8, obj);
    }

    @Override // q.C6407k, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f35209x = 0;
        return super.put(obj, obj2);
    }
}
