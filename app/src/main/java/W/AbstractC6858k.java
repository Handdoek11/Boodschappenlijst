package w;

import J6.r;
import java.util.Iterator;
import x.AbstractC6895a;

/* renamed from: w.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6858k implements Iterator, K6.a {

    /* renamed from: o, reason: collision with root package name */
    private Object[] f44180o = C6857j.f44174d.a().h();

    /* renamed from: s, reason: collision with root package name */
    private int f44181s;

    /* renamed from: t, reason: collision with root package name */
    private int f44182t;

    public final C6857j a() {
        AbstractC6895a.a(g());
        Object obj = this.f44180o[this.f44182t];
        r.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (C6857j) obj;
    }

    protected final Object[] b() {
        return this.f44180o;
    }

    protected final int d() {
        return this.f44182t;
    }

    public final boolean e() {
        return this.f44182t < this.f44181s;
    }

    public final boolean g() {
        AbstractC6895a.a(this.f44182t >= this.f44181s);
        return this.f44182t < this.f44180o.length;
    }

    public final void h() {
        AbstractC6895a.a(g());
        this.f44182t++;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return e();
    }

    public final void i(Object[] objArr, int i8) {
        j(objArr, i8, 0);
    }

    public final void j(Object[] objArr, int i8, int i9) {
        this.f44180o = objArr;
        this.f44181s = i8;
        this.f44182t = i9;
    }

    protected final void k(int i8) {
        this.f44182t = i8;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
