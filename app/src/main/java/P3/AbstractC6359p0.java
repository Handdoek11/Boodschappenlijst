package p3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: p3.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6359p0 {
    public static C6355n0 a(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        int length = split.length;
        if (length == 1) {
            String valueOf = String.valueOf(context.getPackageName());
            str3 = split[0];
            str2 = valueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            str2 = split[0];
            str3 = split[1];
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return new C6355n0(str2, str3);
    }

    public static void b(Context context, Set set) {
        C6357o0 c6357o0 = new C6357o0(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C6355n0 a8 = a(context, str);
            if (a8 == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                c6357o0.d(a8.f40361a).remove(a8.f40362b);
            }
        }
        c6357o0.b();
    }
}
