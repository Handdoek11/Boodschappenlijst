package com.google.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class i extends AbstractList implements j, RandomAccess {

    /* renamed from: s, reason: collision with root package name */
    public static final j f33103s = new i().i();

    /* renamed from: o, reason: collision with root package name */
    private final List f33104o;

    public i() {
        this.f33104o = new ArrayList();
    }

    private static d c(Object obj) {
        return obj instanceof d ? (d) obj : obj instanceof String ? d.n((String) obj) : d.e((byte[]) obj);
    }

    private static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof d ? ((d) obj).J() : h.b((byte[]) obj);
    }

    @Override // com.google.protobuf.j
    public void E(d dVar) {
        this.f33104o.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i8, String str) {
        this.f33104o.add(i8, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f33104o.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String get(int i8) {
        Object obj = this.f33104o.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String J7 = dVar.J();
            if (dVar.s()) {
                this.f33104o.set(i8, J7);
            }
            return J7;
        }
        byte[] bArr = (byte[]) obj;
        String b8 = h.b(bArr);
        if (h.a(bArr)) {
            this.f33104o.set(i8, b8);
        }
        return b8;
    }

    @Override // com.google.protobuf.j
    public List h() {
        return DesugarCollections.unmodifiableList(this.f33104o);
    }

    @Override // com.google.protobuf.j
    public d h0(int i8) {
        Object obj = this.f33104o.get(i8);
        d c8 = c(obj);
        if (c8 != obj) {
            this.f33104o.set(i8, c8);
        }
        return c8;
    }

    @Override // com.google.protobuf.j
    public j i() {
        return new q(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String remove(int i8) {
        Object remove = this.f33104o.remove(i8);
        ((AbstractList) this).modCount++;
        return d(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public String set(int i8, String str) {
        return d(this.f33104o.set(i8, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f33104o.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i8, Collection collection) {
        if (collection instanceof j) {
            collection = ((j) collection).h();
        }
        boolean addAll = this.f33104o.addAll(i8, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public i(j jVar) {
        this.f33104o = new ArrayList(jVar.size());
        addAll(jVar);
    }
}
