package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class w implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f37201a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f C();

    abstract void G(ObjectOutput objectOutput);

    public abstract String i();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.e("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.e("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.e("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.e("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.e("AST", "America/Anchorage"), j$.com.android.tools.r8.a.e("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.e("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.e("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.e("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.e("CST", "America/Chicago"), j$.com.android.tools.r8.a.e("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.e("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.e("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.e("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.e("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.e("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.e("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.e("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.e("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.e("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.e("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.e("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.e("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.e("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.e("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.e("EST", "-05:00"), j$.com.android.tools.r8.a.e("MST", "-07:00"), j$.com.android.tools.r8.a.e("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i8 = 0; i8 < 28; i8++) {
            Map.Entry entry = entryArr[i8];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        f37201a = Collections.unmodifiableMap(hashMap);
    }

    public static w E(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.I() != 0) {
            str = str.concat(zoneOffset.i());
        }
        return new x(str, j$.time.zone.f.h(zoneOffset));
    }

    static w D(String str, boolean z7) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.J(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return F(str, 3, z7);
        }
        if (str.startsWith("UT")) {
            return F(str, 2, z7);
        }
        return x.H(str, z7);
    }

    private static w F(String str, int i8, boolean z7) {
        String substring = str.substring(0, i8);
        if (str.length() == i8) {
            return E(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i8) != '+' && str.charAt(i8) != '-') {
            return x.H(str, z7);
        }
        try {
            ZoneOffset J7 = ZoneOffset.J(str.substring(i8));
            if (J7 == ZoneOffset.UTC) {
                return E(substring, J7);
            }
            return E(substring, J7);
        } catch (c e8) {
            throw new c("Invalid ID for offset-based ZoneId: ".concat(str), e8);
        }
    }

    w() {
        if (getClass() != ZoneOffset.class && getClass() != x.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return i().equals(((w) obj).i());
        }
        return false;
    }

    public int hashCode() {
        return i().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return i();
    }

    private Object writeReplace() {
        return new s((byte) 7, this);
    }
}
