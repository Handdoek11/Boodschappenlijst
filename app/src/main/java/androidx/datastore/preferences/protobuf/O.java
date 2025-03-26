package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
abstract class O {
    private static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static boolean b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? ((Float) obj).floatValue() == 0.0f : obj instanceof Double ? ((Double) obj).doubleValue() == 0.0d : obj instanceof String ? obj.equals("") : obj instanceof AbstractC0883g ? obj.equals(AbstractC0883g.f9378s) : obj instanceof M ? obj == ((M) obj).c() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    static final void c(StringBuilder sb, int i8, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb, i8, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb, i8, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(h0.c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0883g) {
            sb.append(": \"");
            sb.append(h0.a((AbstractC0883g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0897v) {
            sb.append(" {");
            d((AbstractC0897v) obj, sb, i8 + 2);
            sb.append("\n");
            while (i9 < i8) {
                sb.append(' ');
                i9++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i8 + 2;
        c(sb, i11, "key", entry.getKey());
        c(sb, i11, "value", entry.getValue());
        sb.append("\n");
        while (i9 < i8) {
            sb.append(' ');
            i9++;
        }
        sb.append("}");
    }

    private static void d(M m8, StringBuilder sb, int i8) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : m8.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", "");
            boolean z7 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i8, a(str2), AbstractC0897v.w(method2, m8, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i8, a(str3), AbstractC0897v.w(method3, m8, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get" + replaceFirst);
                Method method5 = (Method) hashMap.get("has" + replaceFirst);
                if (method4 != null) {
                    Object w7 = AbstractC0897v.w(method4, m8, new Object[0]);
                    if (method5 != null) {
                        z7 = ((Boolean) AbstractC0897v.w(method5, m8, new Object[0])).booleanValue();
                    } else if (b(w7)) {
                        z7 = false;
                    }
                    if (z7) {
                        c(sb, i8, a(str4), w7);
                    }
                }
            }
        }
        j0 j0Var = ((AbstractC0897v) m8).unknownFields;
        if (j0Var != null) {
            j0Var.m(sb, i8);
        }
    }

    static String e(M m8, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(m8, sb, 0);
        return sb.toString();
    }
}
