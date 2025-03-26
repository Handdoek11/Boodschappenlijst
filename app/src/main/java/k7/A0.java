package k7;

import J6.AbstractC0642b;
import java.util.ArrayList;
import java.util.Iterator;
import y6.AbstractC6980h;

/* loaded from: classes2.dex */
public final class A0 extends AbstractC6158w {

    /* renamed from: b, reason: collision with root package name */
    private final Q6.b f38585b;

    /* renamed from: c, reason: collision with root package name */
    private final i7.f f38586c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(Q6.b bVar, g7.b bVar2) {
        super(bVar2, null);
        J6.r.e(bVar, "kClass");
        J6.r.e(bVar2, "eSerializer");
        this.f38585b = bVar;
        this.f38586c = new C6121d(bVar2.getDescriptor());
    }

    @Override // k7.AbstractC6158w, g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return this.f38586c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        J6.r.e(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i8) {
        J6.r.e(arrayList, "<this>");
        arrayList.ensureCapacity(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator d(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        return AbstractC0642b.a(objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int e(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        return objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6158w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList arrayList, int i8, Object obj) {
        J6.r.e(arrayList, "<this>");
        arrayList.add(i8, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(Object[] objArr) {
        J6.r.e(objArr, "<this>");
        return new ArrayList(AbstractC6980h.c(objArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object[] l(ArrayList arrayList) {
        J6.r.e(arrayList, "<this>");
        return AbstractC6146p0.n(arrayList, this.f38585b);
    }
}
