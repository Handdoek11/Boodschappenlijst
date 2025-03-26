package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2468e1 {
    public static int a(int i8) {
        int i9 = 0;
        while (i8 > 0) {
            i8 >>>= 1;
            i9++;
        }
        return i9;
    }

    public static C3503nb b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            String str = (String) list.get(i8);
            int i9 = AbstractC2301cW.f21206a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                HL.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(T1.a(new UQ(Base64.decode(split[1], 0))));
                } catch (RuntimeException e8) {
                    HL.g("VorbisUtil", "Failed to parse vorbis picture", e8);
                }
            } else {
                arrayList.add(new M2(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C3503nb(arrayList);
    }

    public static C2143b1 c(UQ uq, boolean z7, boolean z8) {
        if (z7) {
            d(3, uq, false);
        }
        String b8 = uq.b((int) uq.I(), StandardCharsets.UTF_8);
        int length = b8.length();
        long I7 = uq.I();
        String[] strArr = new String[(int) I7];
        int i8 = length + 15;
        for (int i9 = 0; i9 < I7; i9++) {
            String b9 = uq.b((int) uq.I(), StandardCharsets.UTF_8);
            strArr[i9] = b9;
            i8 = i8 + 4 + b9.length();
        }
        if (z8 && (uq.C() & 1) == 0) {
            throw zzbc.a("framing bit expected to be set", null);
        }
        return new C2143b1(b8, strArr, i8 + 1);
    }

    public static boolean d(int i8, UQ uq, boolean z7) {
        if (uq.r() < 7) {
            if (z7) {
                return false;
            }
            throw zzbc.a("too short header: " + uq.r(), null);
        }
        if (uq.C() != i8) {
            if (z7) {
                return false;
            }
            throw zzbc.a("expected header type ".concat(String.valueOf(Integer.toHexString(i8))), null);
        }
        if (uq.C() == 118 && uq.C() == 111 && uq.C() == 114 && uq.C() == 98 && uq.C() == 105 && uq.C() == 115) {
            return true;
        }
        if (z7) {
            return false;
        }
        throw zzbc.a("expected characters 'vorbis'", null);
    }
}
