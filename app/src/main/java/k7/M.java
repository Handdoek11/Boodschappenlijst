package k7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class M extends AbstractC6130h0 {

    /* renamed from: c, reason: collision with root package name */
    private final i7.f f38636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(g7.b bVar, g7.b bVar2) {
        super(bVar, bVar2, null);
        J6.r.e(bVar, "kSerializer");
        J6.r.e(bVar2, "vSerializer");
        this.f38636c = new L(bVar.getDescriptor(), bVar2.getDescriptor());
    }

    @Override // k7.AbstractC6130h0, g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return this.f38636c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public HashMap a() {
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(HashMap hashMap) {
        J6.r.e(hashMap, "<this>");
        return hashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(HashMap hashMap, int i8) {
        J6.r.e(hashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Iterator d(Map map) {
        J6.r.e(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int e(Map map) {
        J6.r.e(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public HashMap k(Map map) {
        J6.r.e(map, "<this>");
        HashMap hashMap = map instanceof HashMap ? (HashMap) map : null;
        return hashMap == null ? new HashMap(map) : hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k7.AbstractC6115a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Map l(HashMap hashMap) {
        J6.r.e(hashMap, "<this>");
        return hashMap;
    }
}
