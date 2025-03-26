package k7;

import java.util.ArrayList;
import java.util.List;

/* renamed from: k7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6125f extends AbstractC6160x {

    /* renamed from: b, reason: collision with root package name */
    private final i7.f f38676b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6125f(g7.b bVar) {
        super(bVar);
        J6.r.e(bVar, "element");
        this.f38676b = new C6123e(bVar.getDescriptor());
    }

    @Override // k7.AbstractC6158w, g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return this.f38676b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        J6.r.e(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i8) {
        J6.r.e(arrayList, "<this>");
        arrayList.ensureCapacity(i8);
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
    public ArrayList k(List list) {
        J6.r.e(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public List l(ArrayList arrayList) {
        J6.r.e(arrayList, "<this>");
        return arrayList;
    }
}
