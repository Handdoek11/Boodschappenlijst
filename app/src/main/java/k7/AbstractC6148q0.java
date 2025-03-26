package k7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* renamed from: k7.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6148q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final i7.f[] f38717a = new i7.f[0];

    public static final Set a(i7.f fVar) {
        J6.r.e(fVar, "<this>");
        if (fVar instanceof InterfaceC6141n) {
            return ((InterfaceC6141n) fVar).b();
        }
        HashSet hashSet = new HashSet(fVar.g());
        int g8 = fVar.g();
        for (int i8 = 0; i8 < g8; i8++) {
            hashSet.add(fVar.h(i8));
        }
        return hashSet;
    }

    public static final i7.f[] b(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        if (list != null) {
            Object[] array = list.toArray(new i7.f[0]);
            J6.r.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            i7.f[] fVarArr = (i7.f[]) array;
            if (fVarArr != null) {
                return fVarArr;
            }
        }
        return f38717a;
    }

    public static final Q6.b c(Q6.k kVar) {
        J6.r.e(kVar, "<this>");
        Q6.c c8 = kVar.c();
        if (c8 instanceof Q6.b) {
            return (Q6.b) c8;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + c8).toString());
    }

    public static final Void d(Q6.b bVar) {
        J6.r.e(bVar, "<this>");
        throw new SerializationException("Serializer for class '" + bVar.a() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }
}
