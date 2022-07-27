/* 
 * This file is part of *** MyCoRe LibMeta ***
 * See https://github.com/MyCoRe-Org/libmeta/ for details.
 * 
 * MyCoRe LibMeta is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published 
 * by the Free Software Foundation, either version 3 of the License, 
 * or (at your option) any later version.
 *
 * MyCoRe LibMeta is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with MyCoRe LibMeta.  If not, see <http://www.gnu.org/licenses/>.
 */
@XmlSchema(namespace = "info:srw/schema/5/picaXML-v1.0",  
        xmlns = {   
            @XmlNs(namespaceURI = "info:srw/schema/5/picaXML-v1.0", prefix = "pica"),  
            @XmlNs(namespaceURI = "http://www.w3.org/2001/XMLSchema-instance", prefix = "xsi")
        },  
        elementFormDefault = jakarta.xml.bind.annotation.XmlNsForm.QUALIFIED)  
      
    package org.mycore.libmeta.picaxml.model; 
      
    import jakarta.xml.bind.annotation.XmlNs;
import jakarta.xml.bind.annotation.XmlSchema;  