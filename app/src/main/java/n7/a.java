package n7;

import I6.l;
import J6.H;
import J6.L;
import J6.r;
import androidx.appcompat.app.E;
import g7.h;
import java.util.List;
import java.util.Map;
import k7.AbstractC6146p0;

/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f39792a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f39793b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f39794c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f39795d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f39796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Map map, Map map2, Map map3, Map map4, Map map5) {
        super(null);
        r.e(map, "class2ContextualFactory");
        r.e(map2, "polyBase2Serializers");
        r.e(map3, "polyBase2DefaultSerializerProvider");
        r.e(map4, "polyBase2NamedSerializers");
        r.e(map5, "polyBase2DefaultDeserializerProvider");
        this.f39792a = map;
        this.f39793b = map2;
        this.f39794c = map3;
        this.f39795d = map4;
        this.f39796e = map5;
    }

    @Override // n7.b
    public void a(d dVar) {
        r.e(dVar, "collector");
        for (Map.Entry entry : this.f39792a.entrySet()) {
            E.a(entry.getValue());
        }
        for (Map.Entry entry2 : this.f39793b.entrySet()) {
            Q6.b bVar = (Q6.b) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                Q6.b bVar2 = (Q6.b) entry3.getKey();
                g7.b bVar3 = (g7.b) entry3.getValue();
                r.c(bVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                r.c(bVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                r.c(bVar3, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                dVar.b(bVar, bVar2, bVar3);
            }
        }
        for (Map.Entry entry4 : this.f39794c.entrySet()) {
            Q6.b bVar4 = (Q6.b) entry4.getKey();
            l lVar = (l) entry4.getValue();
            r.c(bVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            r.c(lVar, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            dVar.c(bVar4, (l) L.d(lVar, 1));
        }
        for (Map.Entry entry5 : this.f39796e.entrySet()) {
            Q6.b bVar5 = (Q6.b) entry5.getKey();
            l lVar2 = (l) entry5.getValue();
            r.c(bVar5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            r.c(lVar2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            dVar.a(bVar5, (l) L.d(lVar2, 1));
        }
    }

    @Override // n7.b
    public g7.b b(Q6.b bVar, List list) {
        r.e(bVar, "kClass");
        r.e(list, "typeArgumentsSerializers");
        E.a(this.f39792a.get(bVar));
        return null;
    }

    @Override // n7.b
    public g7.a d(Q6.b bVar, String str) {
        r.e(bVar, "baseClass");
        Map map = (Map) this.f39795d.get(bVar);
        g7.b bVar2 = map != null ? (g7.b) map.get(str) : null;
        if (!(bVar2 instanceof g7.b)) {
            bVar2 = null;
        }
        if (bVar2 != null) {
            return bVar2;
        }
        Object obj = this.f39796e.get(bVar);
        l lVar = L.i(obj, 1) ? (l) obj : null;
        if (lVar != null) {
            return (g7.a) lVar.invoke(str);
        }
        return null;
    }

    @Override // n7.b
    public h e(Q6.b bVar, Object obj) {
        r.e(bVar, "baseClass");
        r.e(obj, "value");
        if (!AbstractC6146p0.i(obj, bVar)) {
            return null;
        }
        Map map = (Map) this.f39793b.get(bVar);
        g7.b bVar2 = map != null ? (g7.b) map.get(H.b(obj.getClass())) : null;
        if (!(bVar2 instanceof h)) {
            bVar2 = null;
        }
        if (bVar2 != null) {
            return bVar2;
        }
        Object obj2 = this.f39794c.get(bVar);
        l lVar = L.i(obj2, 1) ? (l) obj2 : null;
        if (lVar != null) {
            return (h) lVar.invoke(obj);
        }
        return null;
    }
}
