package k7;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* renamed from: k7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6119c {
    public static final Void a(Q6.b bVar, Q6.b bVar2) {
        J6.r.e(bVar, "subClass");
        J6.r.e(bVar2, "baseClass");
        String a8 = bVar.a();
        if (a8 == null) {
            a8 = String.valueOf(bVar);
        }
        b(a8, bVar2);
        throw new KotlinNothingValueException();
    }

    public static final Void b(String str, Q6.b bVar) {
        String str2;
        J6.r.e(bVar, "baseClass");
        String str3 = "in the scope of '" + bVar.a() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new SerializationException(str2);
    }
}
