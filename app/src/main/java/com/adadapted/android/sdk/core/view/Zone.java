package com.adadapted.android.sdk.core.view;

import J6.AbstractC0650j;
import J6.r;
import J6.s;
import com.adadapted.android.sdk.core.ad.Ad;
import com.adadapted.android.sdk.core.ad.Ad$$serializer;
import com.adadapted.android.sdk.core.view.Dimension;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.C0;
import k7.C6125f;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;
import y6.AbstractC6987o;

@g7.g
/* loaded from: classes.dex */
public final class Zone {
    private final List<Ad> ads;
    private final InterfaceC6928j dimensions$delegate;
    private final String id;
    private final long landHeight;
    private final long landWidth;
    private final long portHeight;
    private final long portWidth;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final g7.b[] $childSerializers = {null, new C6125f(Ad$$serializer.INSTANCE), null, null, null, null};

    /* renamed from: com.adadapted.android.sdk.core.view.Zone$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements I6.a {
        AnonymousClass1() {
            super(0);
        }

        @Override // I6.a
        public final Map<String, Dimension> invoke() {
            HashMap hashMap = new HashMap();
            Zone zone = Zone.this;
            int calculateDimensionValue = zone.calculateDimensionValue((int) zone.getPortHeight());
            Zone zone2 = Zone.this;
            hashMap.put(Dimension.Orientation.PORT, new Dimension(calculateDimensionValue, zone2.calculateDimensionValue((int) zone2.getPortWidth())));
            Zone zone3 = Zone.this;
            int calculateDimensionValue2 = zone3.calculateDimensionValue((int) zone3.getLandHeight());
            Zone zone4 = Zone.this;
            hashMap.put(Dimension.Orientation.LAND, new Dimension(calculateDimensionValue2, zone4.calculateDimensionValue((int) zone4.getLandWidth())));
            return hashMap;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final g7.b serializer() {
            return Zone$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Zone() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateDimensionValue(int i8) {
        return DimensionConverter.INSTANCE.convertDpToPx(i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Zone copy$default(Zone zone, String str, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = zone.id;
        }
        if ((i8 & 2) != 0) {
            list = zone.ads;
        }
        return zone.copy(str, list);
    }

    public static /* synthetic */ void getLandHeight$annotations() {
    }

    public static /* synthetic */ void getLandWidth$annotations() {
    }

    public static /* synthetic */ void getPortHeight$annotations() {
    }

    public static /* synthetic */ void getPortWidth$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(Zone zone, j7.d dVar, i7.f fVar) {
        g7.b[] bVarArr = $childSerializers;
        if (dVar.e(fVar, 0) || !r.a(zone.id, "")) {
            dVar.g(fVar, 0, zone.id);
        }
        if (dVar.e(fVar, 1) || !r.a(zone.ads, AbstractC6987o.e())) {
            dVar.p(fVar, 1, bVarArr[1], zone.ads);
        }
        if (dVar.e(fVar, 2) || zone.portHeight != 0) {
            dVar.u(fVar, 2, zone.portHeight);
        }
        if (dVar.e(fVar, 3) || zone.portWidth != 0) {
            dVar.u(fVar, 3, zone.portWidth);
        }
        if (dVar.e(fVar, 4) || zone.landHeight != 0) {
            dVar.u(fVar, 4, zone.landHeight);
        }
        if (!dVar.e(fVar, 5) && zone.landWidth == 0) {
            return;
        }
        dVar.u(fVar, 5, zone.landWidth);
    }

    public final String component1() {
        return this.id;
    }

    public final List<Ad> component2() {
        return this.ads;
    }

    public final Zone copy(String str, List<Ad> list) {
        r.e(str, "id");
        r.e(list, "ads");
        return new Zone(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zone)) {
            return false;
        }
        Zone zone = (Zone) obj;
        return r.a(this.id, zone.id) && r.a(this.ads, zone.ads);
    }

    public final List<Ad> getAds() {
        return this.ads;
    }

    public final Map<String, Dimension> getDimensions() {
        return (Map) this.dimensions$delegate.getValue();
    }

    public final String getId() {
        return this.id;
    }

    public final long getLandHeight() {
        return this.landHeight;
    }

    public final long getLandWidth() {
        return this.landWidth;
    }

    public final long getPortHeight() {
        return this.portHeight;
    }

    public final long getPortWidth() {
        return this.portWidth;
    }

    public final boolean hasAds() {
        return !this.ads.isEmpty();
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.ads.hashCode();
    }

    public String toString() {
        return "Zone(id=" + this.id + ", ads=" + this.ads + ")";
    }

    public /* synthetic */ Zone(int i8, String str, List list, long j8, long j9, long j10, long j11, C0 c02) {
        this.id = (i8 & 1) == 0 ? "" : str;
        if ((i8 & 2) == 0) {
            this.ads = AbstractC6987o.e();
        } else {
            this.ads = list;
        }
        if ((i8 & 4) == 0) {
            this.portHeight = 0L;
        } else {
            this.portHeight = j8;
        }
        if ((i8 & 8) == 0) {
            this.portWidth = 0L;
        } else {
            this.portWidth = j9;
        }
        if ((i8 & 16) == 0) {
            this.landHeight = 0L;
        } else {
            this.landHeight = j10;
        }
        if ((i8 & 32) == 0) {
            this.landWidth = 0L;
        } else {
            this.landWidth = j11;
        }
        this.dimensions$delegate = AbstractC6929k.a(new AnonymousClass1());
    }

    public Zone(String str, List<Ad> list) {
        r.e(str, "id");
        r.e(list, "ads");
        this.id = str;
        this.ads = list;
        this.dimensions$delegate = AbstractC6929k.a(new AnonymousClass1());
    }

    public /* synthetic */ Zone(String str, List list, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? AbstractC6987o.e() : list);
    }
}
