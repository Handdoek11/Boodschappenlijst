package C3;

import android.content.IntentFilter;

/* loaded from: classes2.dex */
public abstract class P1 {
    public static IntentFilter a(String str) {
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.addDataScheme("wear");
        intentFilter.addDataAuthority("*", null);
        return intentFilter;
    }
}
