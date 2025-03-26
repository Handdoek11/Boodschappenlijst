package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r60, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3893r60 {

    /* renamed from: a, reason: collision with root package name */
    public final int f26094a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26095b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26096c;

    public C3893r60(int i8, int i9, boolean z7) {
        this.f26094a = i8;
        this.f26095b = i9;
        this.f26096c = z7;
    }

    static List a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i8 = 0;
            int i9 = 0;
            boolean z7 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i8 = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i9 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z7 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new C3893r60(i8, i9, z7));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
