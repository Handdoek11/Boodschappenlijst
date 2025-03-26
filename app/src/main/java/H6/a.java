package H6;

import J6.H;
import J6.InterfaceC0647g;
import J6.r;

/* loaded from: classes2.dex */
public abstract class a {
    public static final Class a(Q6.b bVar) {
        r.e(bVar, "<this>");
        Class c8 = ((InterfaceC0647g) bVar).c();
        r.c(c8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return c8;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class b(Q6.b bVar) {
        r.e(bVar, "<this>");
        Class c8 = ((InterfaceC0647g) bVar).c();
        if (!c8.isPrimitive()) {
            r.c(c8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return c8;
        }
        String name = c8.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    c8 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    c8 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    c8 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    c8 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    c8 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    c8 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    c8 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    c8 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    c8 = Short.class;
                    break;
                }
                break;
        }
        r.c(c8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return c8;
    }

    public static final Q6.b c(Class cls) {
        r.e(cls, "<this>");
        return H.b(cls);
    }
}
