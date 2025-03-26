package m7;

/* loaded from: classes2.dex */
public abstract class L {
    public static final Object a(l7.a aVar, String str, l7.t tVar, g7.a aVar2) {
        J6.r.e(aVar, "<this>");
        J6.r.e(str, "discriminator");
        J6.r.e(tVar, "element");
        J6.r.e(aVar2, "deserializer");
        return new z(aVar, tVar, str, aVar2.getDescriptor()).w(aVar2);
    }
}
