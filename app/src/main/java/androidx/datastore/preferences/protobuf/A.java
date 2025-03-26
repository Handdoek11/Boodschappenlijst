package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class A extends AbstractC0879c implements B, RandomAccess {

    /* renamed from: t, reason: collision with root package name */
    private static final A f9280t;

    /* renamed from: u, reason: collision with root package name */
    public static final B f9281u;

    /* renamed from: s, reason: collision with root package name */
    private final List f9282s;

    static {
        A a8 = new A();
        f9280t = a8;
        a8.k();
        f9281u = a8;
    }

    public A() {
        this(10);
    }

    private static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC0883g ? ((AbstractC0883g) obj).C() : AbstractC0899x.j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public void M(AbstractC0883g abstractC0883g) {
        b();
        this.f9282s.add(abstractC0883g);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0879c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i8, String str) {
        b();
        this.f9282s.add(i8, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0879c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        this.f9282s.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i8) {
        Object obj = this.f9282s.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0883g) {
            AbstractC0883g abstractC0883g = (AbstractC0883g) obj;
            String C7 = abstractC0883g.C();
            if (abstractC0883g.q()) {
                this.f9282s.set(i8, C7);
            }
            return C7;
        }
        byte[] bArr = (byte[]) obj;
        String j8 = AbstractC0899x.j(bArr);
        if (AbstractC0899x.g(bArr)) {
            this.f9282s.set(i8, j8);
        }
        return j8;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0879c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public List h() {
        return DesugarCollections.unmodifiableList(this.f9282s);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0879c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public B i() {
        return x0() ? new l0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0899x.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public A u(int i8) {
        if (i8 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i8);
        arrayList.addAll(this.f9282s);
        return new A(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public String remove(int i8) {
        b();
        Object remove = this.f9282s.remove(i8);
        ((AbstractList) this).modCount++;
        return d(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public String set(int i8, String str) {
        b();
        return d(this.f9282s.set(i8, str));
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public Object p0(int i8) {
        return this.f9282s.get(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0879c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0879c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9282s.size();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0879c, androidx.datastore.preferences.protobuf.AbstractC0899x.b
    public /* bridge */ /* synthetic */ boolean x0() {
        return super.x0();
    }

    public A(int i8) {
        this(new ArrayList(i8));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0879c, java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection collection) {
        b();
        if (collection instanceof B) {
            collection = ((B) collection).h();
        }
        boolean addAll = this.f9282s.addAll(i8, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0879c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private A(ArrayList arrayList) {
        this.f9282s = arrayList;
    }
}
