package m7;

import i7.j;
import java.lang.annotation.Annotation;
import k7.AbstractC6117b;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public abstract class E {
    public static final void b(i7.j jVar) {
        J6.r.e(jVar, "kind");
        if (jVar instanceof j.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (jVar instanceof i7.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (jVar instanceof i7.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(i7.f fVar, l7.a aVar) {
        J6.r.e(fVar, "<this>");
        J6.r.e(aVar, "json");
        for (Annotation annotation : fVar.f()) {
            if (annotation instanceof l7.e) {
                return ((l7.e) annotation).discriminator();
            }
        }
        return aVar.d().c();
    }

    public static final Object d(l7.g gVar, g7.a aVar) {
        l7.v j8;
        J6.r.e(gVar, "<this>");
        J6.r.e(aVar, "deserializer");
        if (!(aVar instanceof AbstractC6117b) || gVar.b().d().k()) {
            return aVar.deserialize(gVar);
        }
        String c8 = c(aVar.getDescriptor(), gVar.b());
        l7.h m8 = gVar.m();
        i7.f descriptor = aVar.getDescriptor();
        if (m8 instanceof l7.t) {
            l7.t tVar = (l7.t) m8;
            l7.h hVar = (l7.h) tVar.get(c8);
            String b8 = (hVar == null || (j8 = l7.i.j(hVar)) == null) ? null : j8.b();
            g7.a c9 = ((AbstractC6117b) aVar).c(gVar, b8);
            if (c9 != null) {
                return L.a(gVar.b(), c8, tVar, c9);
            }
            e(b8, tVar);
            throw new KotlinNothingValueException();
        }
        throw u.d(-1, "Expected " + J6.H.b(l7.t.class) + " as the serialized body of " + descriptor.a() + ", but had " + J6.H.b(m8.getClass()));
    }

    public static final Void e(String str, l7.t tVar) {
        String str2;
        J6.r.e(tVar, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw u.e(-1, "Polymorphic serializer was not found for " + str2, tVar.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g7.h hVar, g7.h hVar2, String str) {
    }
}
